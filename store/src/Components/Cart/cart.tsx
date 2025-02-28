"use client";
import Link from "next/link";
import React, { useState } from "react";
import { RiDeleteBinLine } from "react-icons/ri";

export default function Cart() {
  const [products, setProducts] = useState([
    {
      "id": 1,
      "name": "Produto 1",
      "price": 200.00,
      "qtd": 1,
      "estoque": true
    },
    {
      "id": 2,
      "name": "Produto 2",
      "price": 150.00,
      "qtd": 1,
      "estoque": true
    }
  ]);

 
  const reduProduct = (id) => {
    setProducts((prevProducts) =>
      prevProducts
        .map((product) =>
          product.id === id
            ? { ...product, qtd: product.qtd - 1 }
            : product
        )
        .filter((product) => product.qtd > 0) 
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

  const remProduct = (id) => {
    setProducts((prevProducts) =>
      prevProducts.filter((product) => product.id !== id)
    );
  };

  return (
    <div>
      <h1>Carrinho de Compras</h1>
      <ul>
        {products.length > 0 ? (
          products.map((product) => (
            <li key={product.id}>
              <p>--------------------------------------------------------------------------</p>
              <Link href={`/produtos/produto/${product.id}`}>{product.name}</Link>
              <p>Preço: R$ {product.price}</p>
              <div>
                <button onClick={() => reduProduct(product.id)}>-</button>
                <p>Quantidade: {product.qtd}</p>
                <button onClick={() => addProduct(product.id)}>+</button>
              </div>
              <div>
                <button onClick={() => remProduct(product.id)}>
                  <RiDeleteBinLine />
                </button>
              </div>
              <p>{product.estoque ? "Em estoque" : "Fora de estoque"}</p>
            </li>
          ))
        ) : (
          <p>Sem Produtos</p>
        )}
      </ul>
    </div>
  );
}
