public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super();//it will call CustomStack

    }

    public DynamicStack(int size) {
        super(size);  //it will call CustomStack size
    }

    @Override
    public boolean push(int item) {
        //this take care of being full

        if (this.isFull()) {
            //double the array size
            int[] temp = new int [data.length * 2];
            //copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at tis point WE know that array is not full
        //insert items

        return super.push(item);

    }
}
