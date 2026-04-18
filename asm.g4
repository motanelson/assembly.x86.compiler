
grammar asm;

// ==========================
// Parser
// ==========================

program
    : (line | NEWLINE)* EOF
    ;

line
    : (labelDefinition | instruction | directive)
    ;

// ==========================
// Label
// ==========================

labelDefinition
    : Identifier ':'
    ;

// ==========================
// Instruções
// ==========================

instruction
    : mnemonic (operandList)?
    ;

operandList
    : operand (',' operand)*
    ;

mnemonic
    : Identifier   // muito mais flexível
    ;

// ==========================
// Diretivas
// ==========================

directive
    : 'section' STRING
    | 'global' Identifier
    | 'extern' Identifier
    ;

// ==========================
// Operandos
// ==========================

operand
    : register
    | immediate
    | memory
    | Identifier
    ;

register
    : 'eax' | 'ebx' | 'ecx' | 'edx'
    | 'esp' | 'ebp' | 'esi' | 'edi'
    ;

// números imediatos
immediate
    : ('$'? Integer)
    | ('$'? Hexadecimal)
    ;

// memória mais avançada
memory
    : '[' memoryExpr ']'
    ;

memoryExpr
    : register (('+' | '-') (register | Integer))*
    ;

// ==========================
// Lexer
// ==========================

Identifier
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

Integer
    : [0-9]+
    ;

Hexadecimal
    : '0x' [0-9a-fA-F]+
    ;

STRING
    : '"' (~["\r\n])* '"'
    ;

COMMENT
    : ';' ~[\r\n]* -> skip
    ;

Whitespace
    : [ \t]+ -> skip
    ;

NEWLINE
    : '\r'? '\n'
    ;