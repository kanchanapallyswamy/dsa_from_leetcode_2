class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        for (int i : students) q.add(i);
        for (int i : sandwiches) q1.add(i);

        int count = 0;

        while (!q.isEmpty() && !q1.isEmpty()) {
            if (q.peek().equals(q1.peek())) {
                q.remove();
                q1.remove();
                count = 0;
            } else {
                q.add(q.remove());
                count++;
            }
            if (count == q.size()) break;
        }

        return q.size();
    }
}
