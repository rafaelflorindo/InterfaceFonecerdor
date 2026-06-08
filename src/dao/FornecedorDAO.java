package dao;

import interfaces.InterfaceFornecedorDAO;
import model.Fornecedor;

import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO implements InterfaceFornecedorDAO {

    //persistência a nível de objeto
    List<Fornecedor> listaFornecedores = new ArrayList<>();
    public static int id = 0;
    public FornecedorDAO() {
    }

    @Override
    public boolean salvarFornecedor(Fornecedor fornecedor) {
        id++;
        fornecedor.setId(id);
        return listaFornecedores.add(fornecedor);
    }

    @Override
    public boolean excluirFornecedor(int id) {
        if(id > 0){
            if(!listaFornecedores.isEmpty()) {
                for (Fornecedor f : listaFornecedores) {
                    if (f.getId() == id) {
                        listaFornecedores.remove(f);
                        break;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public List<Fornecedor> listarTodosFornecedores() {
        if(!listaFornecedores.isEmpty()){
            return listaFornecedores;
        }
        return List.of();
    }

    @Override
    public Fornecedor buscarFornecedorPorId(int id) {
        if(!listaFornecedores.isEmpty()){
            for (Fornecedor item: listaFornecedores){
                if(item.getId() == id){
                    return item;
                }
            }
        }
        return null;
    }

    @Override
    public Fornecedor buscarFornecedorPorCnpj(String buscaCnpj) {
        if(!listaFornecedores.isEmpty()){
            for (Fornecedor item: listaFornecedores){
                if(item.getCnpj().equals(buscaCnpj)){
                    return item;
                }
            }
        }
        return null;
    }
    //implementar novos atributos
}
