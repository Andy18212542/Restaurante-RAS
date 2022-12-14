<template>
    <div class="person">
        <div class="container">
            <!-- Formulario de datos de ingreso -->
            <br>
            <div class="form-group">

                <input type="hidden" id="id"><!-- Key del registro -->

                <label class="form-label mt-1">Tipo Documento</label>
                <select class="form-select" id="tipoDocumento">
                    <option value="TI">TI</option>
                    <option value="CC">CC</option>
                    <option value="CE">CE</option>
                </select>
                <label class="form-label mt-1">Documento</label>
                <input type="number" class="form-control" id="documento" placeholder="Ingresar número de documento">
                <label class="form-label mt-1">Nombre Completo</label>
                <input type="text" class="form-control" id="nombreCompleto" placeholder="Ingresar su nombre">
                <label class="form-label mt-1">Correo</label>
                <input type="text" class="form-control" id="correo" placeholder="Ingresar su correo">
                <label class="form-label mt-1">Celular</label>
                <input type="number" class="form-control" id="celular" placeholder="Ingresar su celular">
                <label class="form-label mt-1">Dirección</label>
                <input type="text" class="form-control" id="direccion" placeholder="Ingresar su dirección">
                <label class="form-label mt-1">Estado</label>
                <select class="form-select" id="estado">
                    <option value="Seleccione" selected="true">--Seleccione--</option>
                    <option value="1">Activo</option>
                    <option value="0">Inactivo</option>
                </select>
            </div>

            <!-- Botones -->
            <div>
                <br>
                <button type="button" class="btn btn-primary" onclick="dataAdd();">Agregar</button>&nbsp;
            
                <button type="button" class="btn btn-primary" onclick="dataUpdate();">Modificar</button>
                <br>
            </div>
            
            <!-- Data de la API -->
            <table class="table table-hover">
                <br>
                <thead>
                    <tr class="table-active">
                        <th>Tipo documento</th>
                        <th>Documento</th>
                        <th>Nombre Completo</th>
                        <th>Correo</th>
                        <th>Celular</th>
                        <th>Dirección</th>
                        <th>Estado</th>
                        <th>Editar</th>
                        <th>Eliminar</th>
                    </tr>
                </thead>
                <tbody id="dataResult">
                    <!-- Aquí obtiene los datos de la API -->
                </tbody>
            </table>
        </div>
    </div>
</template>

