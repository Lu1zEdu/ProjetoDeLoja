"use client";
import { TipoProdutos } from "@/types";
import Link from "next/link";
import React, { useState, useEffect } from 'react';

export default function Produtos() {
  const [produtos, setProdutos] = useState<TipoProdutos[]>([]);

  useEffect(() => {
        
    const chamadaApi = async () =>{
        const response = await fetch('http://localhost:3000/Api/Produtos');
        const dados = await response.json();
        setProdutos(dados);
    }

    chamadaApi();

  }, [])

  return (
    <div>
      <h1>Produtos</h1>
      <ul>
        {produtos.map((p) => (
          <li key={p.id}>
            <Link href={`/produto/${p.id}`}><h1>{p.nome}</h1></Link>
            <p>Categoria: {p.categoria}</p>
            <p>Preço: R${p.preco.toFixed(2)}</p>
            <p>Estoque: {p.estoque}</p>
            <Link href='/routes/carrinho'>Colocar no Carrinho</Link>
          </li>
        ))}
      </ul>
    </div>
  );
}
