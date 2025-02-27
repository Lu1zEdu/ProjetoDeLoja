// components/SearchBar.js
import { SetStateAction, useState } from 'react';
import { CiSearch } from "react-icons/ci";

const SearchBar = () => {
  const [searchTerm, setSearchTerm] = useState('');
  const [isVisible, setIsVisible] = useState(false);

  const handleSearch = (event: { target: { value: SetStateAction<string>; }; }) => {
    setSearchTerm(event.target.value);
  };

  const toggleVisibility = () => {
    setIsVisible(!isVisible);
  };

  return (
    <div className='flex gap-2'>
      {isVisible && (
        <input
          type="text"
          value={searchTerm}
          onChange={handleSearch}
          placeholder="Search..."
          className="relative border-black rounded-md shadow-sm bg-white self-center top-[1px] w-[20vw] animate-direcao"
        />
      )}
      <button className='text-xl border-2 border-black rounded-3xl p-1 self-center' onClick={toggleVisibility}>
        <CiSearch />
      </button>
    </div>
  );
};

export default SearchBar;