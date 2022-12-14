<template>
    <div class="container">

        <!--Formulario datos de ingreso-->
        <br>

        <div class="form-group">
            <input type="hidden" id="id"><!--Key del registro-->

            <label class="form-label mt-1">ROL</label>
            <input type="text" class="form-control" id="Rol" placeholder="Ingrese Rol">
            <label class="form-label mt-1">Estado</label>
            <select class="form-select" id="estado">
                <option value="Seleccione">--Seleccione--</option>
                <option value="1">Activo</option>
                <option value="0">Inactivo</option>
            </select>
        </div>
        <!-- Botones -->
        <div>
            <br>
            <button type="button" class="btn btn-primary" onclick="dataAdd();">Agregar</button>&nbsp;
            <button type="button" class="btn btn-primary" onclick="dataUpdate();">Modificar</button>
        </div>
        <table class="table table-hover">
            <br>
            <thead>
                <tr class="table-active">
                    <th>Rol</th>
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
</template>
