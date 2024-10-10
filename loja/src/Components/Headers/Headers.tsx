import Link from 'next/link'
import React from 'react'

export default function Headers() {
  return (
    <>
        <header>
            <div>
                {/* Logo da loja */}
            </div>

            {/* Menu de Navegação */}
            <nav>
                <ul>
                    <li><Link href='/'> Home</Link></li>
                    <li><Link href='/routes/produtos'> Produtos</Link></li>
                </ul>
            </nav>
            {/* login e carrinho */}
            <nav>
                <ul>
                    <li><Link href='/routes/login'> Login</Link></li>
                    <li><Link href='/routes/carrinho'> Carrinho</Link></li>
                </ul>
            </nav>
        </header>
    </>
  )
}
