public d() {
  Interceptable interceptable = $ic;
  if (interceptable != null) {
    InitContext newInitContext = TitanRuntime.newInitContext();
    interceptable.invokeUnInit(65537, newInitContext);
    int i13 = newInitContext.flag;
    if ((i13 & 1) != 0) {
      int i14 = i13 & 2;
      newInitContext.thisArg = this;
      interceptable.invokeInitBody(65537, newInitContext);
    }
  }
}
