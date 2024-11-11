import Car from "./Car"
import Bike from "./Bike"
import Rat from "./Rat"

function Garage() {
  const carInfo = { name: "Ford", model: "Mustang"};
  const bikeInfo = { name: "KTM", model: "RC200"};
  const ratInfo = { name: "Blacky", model: "90's"};

  return (
    <>
        <h1>Who Lives in my Garage??</h1>
         <Car info={ carInfo }/>
         <Bike info={ bikeInfo }/>
         <Rat info={ ratInfo }/>
    </>
  )
}
export default Garage