
public class Statistics {
    private int count;
    private int sum = 0;
    public Statistics(){

    }

    public void addNumber(int number){
        this.count++;
        this.sum += number;
    }

    public int getCount(){
        return this.count;
    }

    public int sum(){
        return this.sum;
    }

    public double average(){
        if (this.count > 0) {
            return (1.0 * this.sum)/(this.count * 1.0);
        } else {
            return 0;
        }
        
    }
}
