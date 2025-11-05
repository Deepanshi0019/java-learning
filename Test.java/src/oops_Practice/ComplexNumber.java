package oops_Practice;

public class ComplexNumber {
     private int realNo;
     private int imgNo;

     public ComplexNumber(int realNo,int imgNo){
         this.realNo= realNo;
         this.imgNo = imgNo;
     }

     public int getRealNo(){
         return this.realNo;
     }
     public void setRealNo(int realNo){
         this.realNo = realNo;
     }

    public int getImgNo(){
        return this.imgNo;
    }
    public void setImgNo(int imgNo){
        this.imgNo = imgNo;
    }

    public void print(){
        System.out.println(this.realNo + " i"+ this.imgNo);
    }

    public void add(ComplexNumber c){
         this.realNo = this.realNo + c.realNo;
         this.imgNo = this.imgNo +c.imgNo;
    }

    public void sub(ComplexNumber c){
        this.realNo = this.realNo - c.realNo;
        this.imgNo = this.imgNo - c.imgNo;
    }
}
