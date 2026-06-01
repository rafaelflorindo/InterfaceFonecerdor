package dao;

import interfaces.IFornecedorDAO;
import model.Fornecedor;

import java.util.ArrayList;
import java.util.List;

public class FornecedorDAO implements IFornecedorDAO {
//cria um array ou insere no banco
    @Override
    public void salvar(Fornecedor fornecedor) {
        // código
    }

    @Override
    public void excluir(int id) {
        // código
    }

    @Override
    public List<Fornecedor> listar() {
        return new ArrayList<>();
    }
}