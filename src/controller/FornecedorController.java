package controller;

import dao.FornecedorDAO;
import interfaces.IFornecedorDAO;

public class FornecedorController {

    private IFornecedorDAO dao;

    public FornecedorController() {
        dao = new FornecedorDAO();
    }
}