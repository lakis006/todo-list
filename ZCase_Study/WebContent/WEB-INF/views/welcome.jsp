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
		<div class="mx-auto text-center">
			<h1 class="mx-auto my-0 text-uppercase">Minne-Things</h1>
		</div>
		
		<div class="mx-auto text-center">
			<h2 class="text-white-50 mx-auto mt-2 mb-5">A free, responsive,
					Todo-List!</h2>
		</div>
		<div class="container d-flex h-100 align-items-center blurg">
			<div class="mx-auto text-center">
				<a class="btn btn-primary js-scroll-trigger" href="list-todos">Click
					Here To Take Care of Todos</a>
			</div>
		</div>
	</header>


	<%@include file="footer.jsp"%>
</body>


