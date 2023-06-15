package source.Controller;

import source.Model.Remedio;
import source.Model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    private static List<Remedio> remedioList = new ArrayList<>();


    
    public static List<Remedio> GetProdutos(){
        return remedioList;
    }

}
