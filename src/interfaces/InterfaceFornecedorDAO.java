package interfaces;

import model.Fornecedor;

import java.util.List;

public interface InterfaceFornecedorDAO {

    //código original = 01/06
    public boolean salvarFornecedor(Fornecedor fornecedor);
    public boolean excluirFornecedor(int id);
    public List<Fornecedor> listarTodosFornecedores();

    //Alteração = 08/06
    //inclusão de novos métodos.
    public Fornecedor buscarFornecedorPorId(int id);
    public Fornecedor buscarFornecedorPorCnpj(String buscaCnpj);

}
