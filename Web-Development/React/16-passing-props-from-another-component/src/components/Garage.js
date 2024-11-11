import Car from "./Car"
import Bike from "./Bike"
import Rat from "./Rat"

function Garage() {
  return (
    <>
        <h1>Who Lives in my Garage??</h1>
        <Car status='i run on diesel'/>
        <Bike status='i run on petrol'/>
        <Rat status='i run on foods!' />
    </>
  )
}
export default Garage