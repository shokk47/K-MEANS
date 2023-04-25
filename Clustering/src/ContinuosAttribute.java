class ContinuosAttribute extends Attribute {
    // Rappresentano gli estremi dell'intervallo di valori (doinio) che l'attributo può realmente assumere
    private double max;
    private double min;

    ContinuosAttribute(String name, int index, double min, double max) {
        super(name, index);
        this.max = max;
        this.min = min;
    }
    double getScaledValue(double v){
        // Calcola e restituisce il valore normalizzato del parametro v
        // La normalizzazione ha come codomonio [0,1]
        return (v-this.min)/(this.max-this.min);
    }

}
