public class Main {

	public static void main(String[] args) {
        System.out.println(fb(9));
    }
	
    static int fb(int j){
        if (j < 1){
            return 0;
        }
        if (j < 3){
            return 1;
        }
        int curr = 0;
        for (int i = 0, prew = 1, bprew = 1; i < j - 2; i++){
            curr = prew + bprew;
            bprew = prew;
            prew = curr;
        }
        return curr;
    }  
}
