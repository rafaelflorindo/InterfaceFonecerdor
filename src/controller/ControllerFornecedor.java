package controller;

import dao.FornecedorDAO;
import model.Fornecedor;

import java.util.List;

public class ControllerFornecedor {

    public FornecedorDAO controllerFornecedor;

    public ControllerFornecedor() {
        this.controllerFornecedor = new FornecedorDAO();
    }

    public boolean adicionarFornecedor(Fornecedor fornecedor){
        return controllerFornecedor.salvarFornecedor(fornecedor);
    }

    public List<Fornecedor> listarFornecedores(){
        return controllerFornecedor.listarTodosFornecedores();
    }

    public Fornecedor buscarFornecedorPorId(int id){
        return controllerFornecedor.buscarFornecedorPorId(id);
    }

    public Fornecedor buscarFornecedorPorCnpj(String buscaCnpj){
        return controllerFornecedor.buscarFornecedorPorCnpj(buscaCnpj);
    }
}
