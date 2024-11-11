import { Outlet as Test, Link } from "react-router-dom";

function Confirm()
{
      return (
      <>
        <nav>
          <ul>
            <li>
              <Link to="/">Car</Link>
            </li>
            <li>
              <Link to="/bike">Bike</Link>
            </li>
            <li>
              <Link to="/rat">Rat</Link>
            </li>
            <li>
              <Link to="/flower">Flower</Link>
            </li>
          </ul>
        </nav>
  
        <Test />
      </>
      );
}

export default Confirm;