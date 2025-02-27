"use client"; 
import Link from 'next/link';
import { LuCat } from "react-icons/lu";
import Nav from '../nav/nav';
export default function Headers() {

    return (
        <>
            <header className='flex bg-white text-black'>
                <div >
                    {/* Logo da loja */}
                    <Link href="/">Storecat</Link>
                    <LuCat />
                </div>
                <div>
                    <Nav />
                </div>
            </header>
        </>
    );
}