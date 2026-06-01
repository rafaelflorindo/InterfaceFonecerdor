package interfaces;

import model.Fornecedor;

import java.util.List;

public interface IFornecedorDAO {

    void salvar(Fornecedor fornecedor);

    void excluir(int id);

    List<Fornecedor> listar();
}
