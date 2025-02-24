// src/Components/Headers/Headers.tsx

"use client"; // Isso deve estar no topo

import Link from 'next/link';
import React, { useState, useEffect } from 'react';
import { useRouter } from 'next/navigation'; // Use 'next/navigation' em vez de 'next/router'

export default function Headers() {
    const [query, setQuery] = useState('');
    const [result, setResult] = useState('');
    const [produtos, setProdutos] = useState([]);
    const router = useRouter();

    // Carregar produtos do JSON
    useEffect(() => {
        const loadProdutos = async () => {
            const response = await fetch('/produtos.json');
            const data = await response.json();
            setProdutos(data);
        };
        loadProdutos();
    }, []);

    const handleSearch = () => {
        const produtoEncontrado = produtos.find(produto => 
            produto.nome.toLowerCase() === query.toLowerCase()
        );

        if (produtoEncontrado) {
            // Redireciona para a página do produto
            router.push(`/routes/produto/${produtoEncontrado.id}`);
        } else {
            setResult('Produto não está no catálogo');
        }
    };

    const handleKeyDown = (event: React.KeyboardEvent<HTMLInputElement>) => {
        if (event.key === 'Enter') {
            handleSearch();
        }
    };

    return (
        <>
            <header>
                <div>
                    {/* Logo da loja */}
                </div>

                {/* Menu de Navegação */}
                <nav>
                    <ul>
                        <li><Link href='/'>Home</Link></li>
                        <li><Link href='/routes/produto'>Produtos</Link></li>
                    </ul>
                </nav>
                <div style={{ margin: '20px' }}>
                    <input 
                        type="text" 
                        placeholder="Busca" 
                        value={query} 
                        onChange={(e) => setQuery(e.target.value)} 
                        onKeyDown={handleKeyDown} // Adicionando o manipulador de eventos aqui
                    />
                    <button onClick={handleSearch}>Buscar</button>
                    <div style={{ marginTop: '20px' }}>{result}</div>
                </div>
                {/* login e carrinho */}
                <nav>
                    <ul>
                        <li><Link href='/routes/login'>Login</Link></li>
                        <li><Link href='/routes/carrinho'>Carrinho</Link></li>
                    </ul>
                </nav>
            </header>
        </>
    );
}