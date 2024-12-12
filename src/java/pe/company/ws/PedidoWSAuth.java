/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/EjbWebService.java to edit this template
 */
package pe.company.ws;

import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import pe.company.dao.PedidoDao;
import pe.company.model.PedidoVo;



@WebService(serviceName="PedidoWSAuth")
public class PedidoWSAuth {
//    @Resource
//    private WebServiceContext webServiceContext;
//    private PedidoDao pedidoDao=new PedidoDao();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";   
//     private String username="";
//    private String password="";
//        
//    @WebMethod(operationName="buscar")
//    public PedidoVo buscar(@WebParam(name="id_pedido") Integer id_pedido) 
//    {
//        PedidoVo pedido=new PedidoVo();
//        
//        //contexto para extraer mensaje de cabecera
//        MessageContext messageContext=webServiceContext.getMessageContext();        
//        Map requestHeader=(Map)messageContext.get(MessageContext.HTTP_REQUEST_HEADERS);
//        
//        List usernameList=(List)requestHeader.get("USERNAME");
//        List passwordList=(List)requestHeader.get("PASSWORD");
//        
//        if((usernameList!=null)&&(passwordList!=null))
//        {
//            username=(String)usernameList.get(0);
//            password=(String)passwordList.get(0);
//        }
//        
//        //verificando credenciales
//        if((username.equals("admin"))&&(password.equals("123"))) {
//            pedido=pedidoDao.findById(id_pedido);
//        }
//        else
//        {
//            pedido.setFecha_pedido(null);
//            pedido.setCliente("Sin acceso");
//            pedido.setVendedor("Sin acceso");
//            pedido.setProducto("Sin acceso");
//            pedido.setCantidad(0);
//            pedido.setImporte(0.00);
//        }
//        
//        return pedido;
    } 
}
