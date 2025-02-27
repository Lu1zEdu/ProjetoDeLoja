
"use client"; // Isso deve estar no topo

import Link from 'next/link';

import { IoCartOutline } from "react-icons/io5";
import Search from '../Search/Search';

export default function Nav(){
    return(
        <nav>
            <ul className='flex gap-3'>
                {/* Menu de Navegação */}
                <div className='flex gap-2'>
                   <Search/>
                </div>
                
                <div>
                     <li className='text-xl border-2 border-black rounded-3xl p-1 w-min self-center'>
                        <Link href='/routes/carrinho'>
                            <IoCartOutline />
                        </Link>
                    </li>
                </div>
                <div className='flex gap-2 self-center'>
                    <li><Link href='/routes/login'>Login</Link></li>
                    <span>|</span>
                    <li><Link href='/route/cadastro'>Cadastro</Link></li>
                </div>
            </ul>
        </nav>
    )
}