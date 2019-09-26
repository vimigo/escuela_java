 
  class Calculadora{
      constructor(){
          
      
      this.result=document.getElementById("resultado");
        this.mem=0;
         this.operador="";
         this.anterior=document.getElementById("anterior");
      
         this.nuevoNum=false;
  }
      numeropulsado(eventObj){//
          if(this.nuevoNum){
              this.result.value="0";
              this.nuevoNum=false;
          }
          let valor=eventObj.currentTarget.innerHTML;
          //alert("pulsado " + valor );
                if (valor ==="+/-"){
                    this.result.value = "" + ( - (parseFloat(calculadora.result.value)));
                }else if(valor==="."){
                    if(! this.result.value.includes("."))
                        this.result.value += valor;
                }
                    this.result.value += valor;
            }
            operadorPulsado(eventObj){
                let operadorActual=eventObj.currentTarget.innerHTML;
              //  alert("op" + operadorActual);
              
              
              this.anterior.value=`${this.mem} ${this.operador}`;
              this.result.value="0";
              
              if(this.operador !==""){
                  
                  let valActual=parseFloat(this.result.value);
                  let resultado=eval(this.mem.toString()+this.operador + valActual);
                  this.result.value=resultado;
                 
                
              }
               this.mem=paseFloat(this.result.value);
                this.operador=operadorActual;
             
               this.nuevonum=true;
              
            }
  };
  
   let calculadora=null;
  window.onload=function(){
      let botones =document.getElementsByClassName("num");//array de botones
     calculadora=new Calculadora();
      for (let boton of botones){
          boton.addEventListener("click",(evtObj)=>{calculadora.numeropulsado(evtObj)});
          
      }
      let botonesop=document.getElementsByClassName("oper");
      for(let btnop of botonesop){
          btnop.click=((evtObj)=>{calculadora.operadorPulsado(evtObj)});
      }
  };
 
  //let result = document.getElementById("resultado");
            
           // function numeropulsado(valor) { funcion normal
          