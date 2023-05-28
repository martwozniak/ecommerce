import Image from 'next/image'

type Product = {
  id: string;
  description: string;
  price: string;
}

async function getData() {
  const response = await fetch("http://127.0.0.1:8080/product")
  if (!response.ok) {
    throw new Error('Failed to fetch data');
  }

  return response.json();
}
 
export default async function Home() {
  const data = await getData();
  console.log(data.data)
  return (
    <main>
      <h1 className='font-bold text-3xl'>Products:</h1>
      {
        data.map((product : Product) => (
          <div className='flex gap-2'>
            <span>{product.id}</span>
            <span className='font-bold'> {product.description}</span>
            <span>{product.price}</span>
          </div>
        ))
      }
    </main>
  )
}
