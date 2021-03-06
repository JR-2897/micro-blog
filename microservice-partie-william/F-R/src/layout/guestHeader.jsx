import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import ImgUser from "../assets/2.jpg"

export default class Header extends Component {
    render() {
        return (
            <header class="header-user-dropdown">


			<div class="header-limiter">
				<h1> <Link to='/'> <span>Golf </span></Link></h1>

				<nav>
					<Link to='/golfs'>Liste des golfs</Link>
					<Link to='/golf'>Ajouter un golf</Link>
					<Link to='/managers'>Liste des managers</Link>
					<Link to='/manager'>Ajoute un manager</Link>
				</nav>


				<div class="header-user-menu">
					<img src={ImgUser} alt="Img"/>

					<ul>
						<li><Link to='/'>login</Link></li>
						<li><Link to='/register'class="highlight">register</Link></li>
					</ul>
				</div>

			</div>               
            </header>

        )
    }
}