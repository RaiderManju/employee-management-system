import React from 'react';
import './styles/App.css';
import Header from './components/common/Header';
import Dashboard from './pages/Dashboard';

function App() {
  return (
    <div className="App">
      <Header />
      <main>
        <Dashboard />
      </main>
    </div>
  );
}

export default App;