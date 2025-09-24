import AddOwner from "./owner/Addowner";
import ViewAllOwners from "./owner/ViewAllOwners";
import './App.css';

function App() {
  return (
    <div className="container">
      <AddOwner />
      <hr style={{ margin: '40px 0', borderColor: '#ffcc00' }} />
      <ViewAllOwners />
    </div>
  );
}

export default App;
