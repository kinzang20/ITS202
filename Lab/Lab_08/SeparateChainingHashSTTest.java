class SeparateChainingHashSTTest{
	public static void main(String[] args) { 
        SeparateChainingHashST<String, Integer> st = new SeparateChainingHashST<String, Integer>();
        assert(st.isEmpty()==true);
        st.put("Ongchuk",1);
        st.put("Karma",2);
        st.put("Ongchuk",4);
        st.put("Gyeltshen",5);
        st.put("Phurba",7);
        st.put("Kinzang",8);
        st.delete("Kinzang");
        assert(st.isEmpty()==false);
        assert(st.contains("Ongchuk"));
        System.out.println(st.get("Sonam"));
        System.out.println(st.size());
        System.out.println(st.keys());
    }
}