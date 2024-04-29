/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author María
 */
public class Main {
    
    public static void main(String[] args) {
        
        
    // Estructura de archivos y directorios
let fileSystem = {
    '/': {
        'home': {
            'user': {
                'file1.txt': { type: 'file', size: '1024KB', modified: '2024-04-28' },
                'file2.txt': { type: 'file', size: '512KB', modified: '2024-04-27' },
                'subfolder': {
                    'subfile.txt': { type: 'file', size: '256KB', modified: '2024-04-26' }
                }
            }
        }
    }
};

let currentDirectory = '/home/user';

// Función para mostrar el prompt
function showPrompt() {
    const prompt = document.createElement('div');
    const user = document.createTextNode('user@machine:');
    const directory = document.createTextNode(currentDirectory + ' $ ');
    prompt.appendChild(user);
    prompt.appendChild(directory);
    document.body.appendChild(prompt);
}

// Función para leer entrada estándar
function readInput() {
    const input = prompt('Ingrese un comando:');
    if (input !== null) {
        executeCommand(input.trim());
    }
}

// Función para ejecutar un comando
function executeCommand(input) {
    const [command, ...args] = input.split(' ');
    try {
        switch (command) {
            case 'pwd':
                console.log(currentDirectory);
                break;
            case 'cd':
                changeDirectory(args[0]);
                break;
            case 'ls':
                listDirectory(false);
                break;
            case 'll':
                listDirectory(true);
                break;
            case 'mkdir':
                makeDirectory(args[0]);
                break;
            case 'rm':
                removeFileOrDirectory(args[0]);
                break;
            case 'mv':
                moveFileOrDirectory(args[0], args[1]);
                break;
            case 'help':
                showHelp();
                break;
            case 'exit':
                break;
            default:
                console.log('Comando no reconocido. Escribe "help" para obtener ayuda.');
        }
    } catch (error) {
        console.error('Error:', error.message);
    }
    showPrompt();
}

// Función para cambiar de directorio
function changeDirectory(dir) {
    if (dir === '..') {
        currentDirectory = currentDirectory.substring(0, currentDirectory.lastIndexOf('/'));
    } else if (dir === '/') {
        currentDirectory = '/';
    } else if (fileSystem[currentDirectory][dir] && fileSystem[currentDirectory][dir].type === 'dir') {
        currentDirectory = currentDirectory + '/' + dir;
    } else {
        throw new Error('Directorio no encontrado');
    }
}

// Función para listar directorios y archivos
function listDirectory(ll) {
    const contents = Object.keys(fileSystem[currentDirectory]).sort();
    contents.forEach(item => {
        if (fileSystem[currentDirectory][item].type === 'dir') {
            console.log(item + '/');
        } else {
            console.log(item);
        }
        if (ll && fileSystem[currentDirectory][item].type === 'file') {
            console.log(`   ${fileSystem[currentDirectory][item].size}   ${fileSystem[currentDirectory][item].modified}`);
        }
    });
}

// Función para crear un directorio
function makeDirectory(dir) {
    if (!fileSystem[currentDirectory][dir]) {
        fileSystem[currentDirectory][dir] = { type: 'dir' };
    } else {
        throw new Error('El directorio ya existe');
    }
}

// Función para borrar un archivo o directorio
function removeFileOrDirectory(file) {
    if (fileSystem[currentDirectory][file]) {
        if (fileSystem[currentDirectory][file].type === 'file') {
            delete fileSystem[currentDirectory][file];
        } else if (fileSystem[currentDirectory][file].type === 'dir') {
            const contents = Object.keys(fileSystem[currentDirectory][file]);
            if (contents.length === 0) {
                delete fileSystem[currentDirectory][file];
            } else {
                throw new Error('El directorio no está vacío');
            }
        }
    } else {
        throw new Error('Archivo o directorio no encontrado');
    }
}

// Función para mover o renombrar un archivo o directorio
function moveFileOrDirectory(oldName, newName) {
    if (fileSystem[currentDirectory][oldName]) {
        fileSystem[currentDirectory][newName] = fileSystem[currentDirectory][oldName];
        delete fileSystem[currentDirectory][oldName];
    } else {
        throw new Error('Archivo o directorio no encontrado');
    }
}

// Función para mostrar la ayuda
function showHelp() {
    console.log(`
Comandos disponibles:
- pwd: Muestra cual es la carpeta actual.
- cd <DIR>: Cambia la carpeta actual a 'DIR'. Con '..' cambia a la carpeta superior.
- ls: Muestra la lista de directorios y archivos de la carpeta actual (primero directorios, luego archivos, ambos ordenados alfabéticamente).
- ll: Como ls pero muestra también el tamaño y la fecha de última modificación.
- mkdir <DIR>: Crea el directorio 'DIR' en la carpeta actual.
- rm <FILE>: Borra 'FILE'. Si es una carpeta, borrará primero sus archivos y luego la carpeta. Si tiene subcarpetas, las dejará intactas y mostrará un aviso al usuario.
- mv <FILE1> <FILE2>: Mueve o renombra 'FILE1' a 'FILE2'.
- help: Muestra una breve ayuda con los comandos disponibles.
- exit: Termina el programa.
    `);
}

console.log('Bienvenido a la terminal simplificada. Escribe "help" para obtener ayuda.');
showPrompt();
readInput();
}
