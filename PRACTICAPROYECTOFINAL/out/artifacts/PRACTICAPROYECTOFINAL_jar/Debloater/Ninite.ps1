$source= 'https://drive.google.com/uc?export=download&id=1IXuqG-TY_kJ4kxfOJY6gl1Ope9o4GsxJ'
$output='inite.exe'
Invoke-WebRequest -Uri $source -OutFile $output