"use client";
import React, { useState } from 'react';

export default function Cart() {
  // Definindo o estado para o array de produtos
  const [products, setProducts] = useState([
    {
      id: 1,
      name: "Produto 1",
      price: 200.00,
      qtd: 1,
      estoque: true
    },
    {
      id: 2,
      name: "Produto 2",
      price: 150.00,
      qtd: 2,
      estoque: true
    }
  ]);

  const reduProduct = (id) => {
    setProducts((prevProducts) =>
      prevProducts.map((product) =>
        product.id === id && product.qtd > 0
          ? { ...product, qtd: product.qtd - 1 }
          : product
      )
    );
  };

  const addProduct = (id) => {
    setProducts((prevProducts) =>
      prevProducts.map((product) =>
        product.id === id && product.estoque
          ? { ...product, qtd: product.qtd + 1 }
          : product
      )
    );
  };

  return (
    <div>
      <h1>Carrinho de Compras</h1>
      <ul>
        {products.map((product) => (
          <li key={product.id}>
            <p>--------------------------------------------------------------------------</p>
            <p>{product.name}</p>
            <p>Preço: R$ {product.price}</p>
            <button onClick={() => reduProduct(product.id)}>-</button>
            <p>Quantidade: {product.qtd}</p>
            <button onClick={() => addProduct(product.id)}>+</button>
            <p>{product.estoque ? "Em estoque" : "Fora de estoque"}</p>
          </li>
        ))}
      </ul>
    </div>
  );
}
