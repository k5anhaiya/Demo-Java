class QQ {
    final void rr() 
    {}
    public static void main(String[] args)
    {}
}
  
class MM extends QQ {
  
    // Here we get compile time error
    // since can't extend rr since it is final.
    void rr() {}
}