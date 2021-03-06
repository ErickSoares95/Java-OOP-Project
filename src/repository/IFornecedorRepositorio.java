package repository;

import exception.FornecedorExcecao;
import model.Fornecedor;

public interface IFornecedorRepositorio {
	
	public void adicionar(Fornecedor fornecedor) throws FornecedorExcecao;
	public void remover(String cnpj) throws FornecedorExcecao;
	public Fornecedor procurar(String cnpj) throws FornecedorExcecao;
	public void atulalizar(Fornecedor fornecedor) throws FornecedorExcecao;

}
