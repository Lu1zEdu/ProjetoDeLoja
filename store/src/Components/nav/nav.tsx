
"use client"; // Isso deve estar no topo

import Link from 'next/link';

import { CiSearch } from "react-icons/ci";
import { IoCartOutline } from "react-icons/io5";

export default function Nav(){
    return(
        <nav className=''>
            <ul>
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
                    />
                    <button >
                        <CiSearch />
                    </button>
                </div>
                
                <div>
                     <li>
                        <Link href='/routes/carrinho'>
                            <IoCartOutline />
                        </Link>
                    </li>
                </div>
                <div>
                    <li><Link href='/routes/login'>Login</Link></li>
                    <span>|</span>
                    <li><Link href='/route/cadastro'>Cadastro</Link></li>
                </div>
            </ul>
        </nav>
    )
}