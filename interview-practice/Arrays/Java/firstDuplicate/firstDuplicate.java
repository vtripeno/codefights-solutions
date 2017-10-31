int firstDuplicate(int[] a) {

    HashSet<Integer> map = new HashSet<Integer>();

    for(int i = 0; i < a.length; i++) {
        map.add( a[i]);
            if(map.size()==i) {
                return a[i];
            }

        }

    return -1;
}