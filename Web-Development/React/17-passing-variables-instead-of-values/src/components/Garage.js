import Car from "./Car"
import Bike from "./Bike"
import Rat from "./Rat"

function Garage() {
  const source1 = 'i run on diesel';
  const source2 = 'i run on petrol';
  const source3 = 'i run on foods!';
  return (
    <>
        <h1>Who Lives in my Garage??</h1>
        <Car status= {source1}/>
        <Bike status= {source2}/>
        <Rat status= {source3}/>
    </>
  )
}
export default Garage