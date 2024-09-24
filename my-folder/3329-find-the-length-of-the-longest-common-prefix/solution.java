class Node {
    private Node[] links = new Node[10];
    private boolean wordEnd = false;

    public boolean isNull(int ind) {
        return links[ind] == null;
    }

    public void put(int ind, Node node) {
        links[ind] = node;
    }

    public Node get(int ind) {
        return links[ind];
    }

    public void setEnd() {
        wordEnd = true;
    }

    public boolean isEnd() {
        return wordEnd;
    }
}

class Solution {
    private Node root;

    public Solution() {
        root = new Node();
    }

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int res = 0;

        // Insert arr1 into Trie
        for (int num : arr1) {
            Node temp = root;
            String str = Integer.toString(num);
            for (char ch : str.toCharArray()) {
                int ind = ch - '0';
                if (temp.isNull(ind)) {
                    temp.put(ind, new Node());
                }
                temp = temp.get(ind);
            }
            temp.setEnd();
        }

        // Check arr2 for longest common prefix
        for (int num : arr2) {
            Node temp = root;
            String str = Integer.toString(num);
            int count = 0;
            for (char ch : str.toCharArray()) {
                int ind = ch - '0';
                if (!temp.isNull(ind)) {
                    temp = temp.get(ind);
                    count++;
                } else {
                    break;
                }
            }
            res = Math.max(res, count);
        }

        return res;
    }
}
