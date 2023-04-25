class DiscreteAttribute extends Attribute {
    private String value[]; //array di oggetti String, che rappresentano i possibili valori del dominio discreta

    DiscreteAttribute(String name, int index, String value[]) {
        super(name, index);
        this.value = value;
    }

    int getNumberOfDistinctValues(){
        return value.length;
    }
    String getValue(int i){
        return value[i];
    }
}
