<%@include file="header.jsp"%>



<!-- <header class="masthead">
            <div class="container">
                <div class="masthead-subheading">Welcome ${name}</div>
                <div class="masthead-heading text-uppercase">It's Nice To Meet You</div>
                <a class="btn btn-primary btn-xl text-uppercase js-scroll-trigger" href="list-todos">Click Here To Take Care of Todos</a>
            </div>
        </header> -->

<body>
	<%@include file="navbar.jsp"%>

	<header class="masthead">
		<div class="mx-auto text-center wel">
			<h1 class="mx-auto my-0 text-uppercase">Minne-Things</h1>
		</div>
		
		<div class="mx-auto text-center wel">
			<h2 class="text-white-50 mx-auto mt-2 mb-5 wel">A free, responsive,
					Todo-List!</h2>
		</div>
		<div class="container d-flex h-100 align-items-center blurg">
			<div class="mx-auto text-center wel">
				<a class="btn btn-primary js-scroll-trigger wel minn-btn" href="list-todos">Click
					Here To Take Care of Todos</a>
			</div>
		</div>
	</header>


	<%@include file="footer.jsp"%>
</body>


