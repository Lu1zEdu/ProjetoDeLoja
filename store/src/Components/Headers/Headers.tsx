"use client"; 
import Link from 'next/link';
import { LuCat } from "react-icons/lu";
import Nav from '../nav/nav';
export default function Headers() {

    return (
        <>
            <header className='flex bg-white text-black justify-between self-center p-3 rounded-b-2xl'>
                <div className='flex text-2xl gap-2 self-center'>
                    {/* Logo da loja */}
                    <Link href="/">Storecat</Link>
                    <LuCat className='relative top-[7px]' />
                </div>
                <div>
                    <Nav />
                </div>
            </header>
        </>
    );
}