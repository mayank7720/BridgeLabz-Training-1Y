class RouteLinkedList<T extends Checkpoint> {

    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    public RouteLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void addCheckpoint(T checkpoint) {
        Node newNode = new Node(checkpoint);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public boolean removeCheckpoint(String checkpointId) {
        if (head == null) {
            return false;
        }

        if (head.data.checkpointId.equals(checkpointId)) {
            head = head.next;
            size--;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.checkpointId.equals(checkpointId)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public T findCheckpoint(String checkpointId) {
        Node current = head;
        while (current != null) {
            if (current.data.checkpointId.equals(checkpointId)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node current = head;
        while (current != null) {
            total += current.data.distanceFromLast;
            current = current.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node current = head;
        while (current != null) {
            total += current.data.calculatePenalty();
            current = current.next;
        }
        return total;
    }

    public boolean checkCriticalCheckpoints() {
        boolean hasDelivery = false;
        boolean hasFuel = false;

        Node current = head;
        while (current != null) {
            if (current.data.getType().equals("Delivery")) {
                hasDelivery = true;
            }
            if (current.data.getType().equals("Fuel")) {
                hasFuel = true;
            }
            current = current.next;
        }

        return hasDelivery && hasFuel;
    }

    public void printRoute() {
        Node current = head;
        int index = 1;

        while (current != null) {
            T cp = current.data;
            String status = cp.isDelayed() ? "Delayed" : "On Time";
            double penalty = cp.calculatePenalty();

            System.out.println(index + ". " + cp.getType() + "Checkpoint"
                    + " - " + cp.locationName
                    + " - " + status
                    + " - Penalty: " + penalty);

            current = current.next;
            index++;
        }
    }
}
