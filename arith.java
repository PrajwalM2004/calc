class arith extends extarith{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        arith a=new arith();
        System.out.println(a.add(2,4));
        System.out.println(a.sub(9,5));
        System.out.println(a.mul(5,8));
        System.out.println(a.div(20,10));
        extarith e =new extarith();
        System.out.println(e.square(4));
        System.out.println(e.cube(3));
    }
}