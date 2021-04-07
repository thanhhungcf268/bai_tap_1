public class Main {
    StopWatch stopWatch;
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        Main main=new Main(stopWatch);
        main.selection();
    }
    Main(StopWatch stopWatch){
        this.stopWatch = stopWatch;
    }
    public void selection(){
        stopWatch.start();
        double[] array = new double[100000];
        for (int i=0;i<array.length;i++){
            array[i]= Math.floor(Math.random()*1000-100);
        }
        for (int j=0;j<array.length;j++){
            for (int k=1+j;k<array.length;k++){
                if (array[j]<array[k]){
                    double temp = array[k];
                    array[k]=array[j];
                    array[j]=temp;
                }
            }
        }
        stopWatch.stop();
        System.out.println("Thời gian mất là  : "+stopWatch.getElapsedTime());
    }
}
