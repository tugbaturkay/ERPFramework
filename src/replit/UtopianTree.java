package replit;

public class UtopianTree {
	public static void main(String[] args) {
		int sum=0;
		int j;
		for (int i=1;i<=10;i++){
		     //System.out.println();
		     //for (int j=1;j<3;j++){
		        if(i<=3){
		          j=1;
		        }else {
		           j=2;
		        }
		        System.out.println("year "+i+" -growth "+j+" cm");
		       sum+=j;
		        System.out.println("tree size:" +sum);
		       }
		     
	}

}
	
