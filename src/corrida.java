public class corrida {
   String modeloCarro;
   String motorCarro;
   String fabricanteCarro;
   String nomeMotorista;
   float quilometragemInicial = 0F;
   float quilometragemFinal = 0F;
   float quilometragemTotal =0F;
   float valorTotal = 0F;


   void setmodeloCarro(String modeloCarro){
    this.modeloCarro = modeloCarro;
   }
   String getmodeloCarro(){
    return modeloCarro;
   }

     void setmotorCarro(String motorCarro){
    this.motorCarro = motorCarro;
   }
   String getmotorCarro(){
    return motorCarro;
   }

     void setfabricanteCarro(String fabricanteCarro){
    this.fabricanteCarro = fabricanteCarro;
   }
   String getfabricanteCarro(){
    return fabricanteCarro;
   }

     void setnomeMotorista(String nomeMotorista){
    this.nomeMotorista = nomeMotorista;
   }
   String getnomeMotorista(){
    return nomeMotorista;
   }

   void setquilometragemInicial(float quilometragemInicial){
    this.quilometragemInicial = quilometragemInicial;
   }
    float getquilometragemInicial(){
    return quilometragemInicial;
   }

    void setquilometragemFinal(float quilometragemFinal){
    this.quilometragemFinal = quilometragemFinal;
   }
    float getquilometragemfinal(){
    return quilometragemFinal;
   }


   float calcularQuilometragemPercorrida(){
    quilometragemTotal = quilometragemFinal - quilometragemInicial;
    return quilometragemTotal;
   }

   float calcularValorTotal(){
    valorTotal = quilometragemTotal * 3.75F;
    return valorTotal;
   }



}
