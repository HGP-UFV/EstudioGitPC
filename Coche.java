public class Coche {

    //Atributos
    private String nameCoche;
    private float precioCoche;
    private int puertasCoche;


    //Constructores

        //Vacío
    public Coche()
    {

    }

        //Parametrizado
    public Coche(String nameCocheConstructor, float precioCocheConstructor, int puertasCocheConstructor)
    {
        nameCoche = nameCocheConstructor;
        precioCoche = precioCocheConstructor;
        puertasCoche = puertasCocheConstructor;
    }



    //Metodos

        //Getter Setter nameCoche
    public String GetNameCoche()
    {
        return nameCoche;
    }
    public void SetNameCoche(String nameCocheSetter)
    {
        nameCoche = nameCocheSetter;
    }
        //Getter Setter nameCoche



    //Getter Setter precioCoche
    public float GetPrecioCoche()
    {
        return precioCoche;
    }
    public void SetPrecioCoche(float precioCocheSetter)
    {
        precioCoche = precioCocheSetter;
    }
    //Getter Setter precioCoche





    //Getter Setter puertasCoche
    public int GetPuertasCoche()
    {
        return puertasCoche;
    }
    public void SetPuertasCoche(int puertasCocheSetter)
    {
        puertasCoche = puertasCocheSetter;
    }
    //Getter Setter puertasCoche




}//Class Coche
