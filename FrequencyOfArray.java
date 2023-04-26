public class FrequencyOfArray {
    public static void main(String[] args) {
  int [] dizi = {2,2,3,6,8,4,6,6,5,8,5,4,5};

  for(int j = 0 ; j < dizi.length ; j++){
            int count = 0;
            boolean isCount = false;

            for (int k = j-1 ; k >= 0 ; --k){
                if(dizi[k]==dizi[j]){
                    isCount = true;
                    break;
                }
            }

            if(!isCount){
                for(int i = 0 ; i < dizi.length ; i++){
                    if (dizi[j] == dizi[i]) count++;
                }
            }


            if(count >= 2)System.out.println("Number of repeats of "+dizi[j]+" :"+count);
        }


    }
}
