CREATE TABLE produto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_produto VARCHAR(255) NOT NULL,
    estoque_produto INT NOT NULL,
    ativo INT NOT NULL,
    fornecedor_produto VARCHAR(255) NOT NULL,
    preco_compra_produto DOUBLE NOT NULL,
    preco_venda_produto DOUBLE NOT NULL,
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES categoria(id)
);
